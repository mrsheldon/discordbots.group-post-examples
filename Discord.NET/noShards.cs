using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using (var webclient = new HttpClient())
using (var content = new StringContent($"{{ \"count\": {client.Guilds.Count}}}", Encoding.UTF8, "application/x-www-form-urlencoded"))
{
    webclient.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("token");
    HttpResponseMessage response = await webclient.PostAsync("https://discordbots.group/api/bot/YOUR_BOT_ID_HERE", content);
}