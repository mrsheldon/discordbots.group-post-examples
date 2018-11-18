HttpClient client = new HttpClient();
            HttpRequestMessage request = new HttpRequestMessage(HttpMethod.Post, "https://discordbots.org/api/bots/<BotID>/stats");
            string json = JsonConvert.SerializeObject(new { count = e.Client.Guilds.Count });
            request.Content = new StringContent(json);
            request.Content.Headers.ContentType = new MediaTypeHeaderValue("application/json");
            request.Headers.Add("Authorization", "Token");
            HttpResponseMessage message = await client.SendAsync(request);
            client.Dispose();
