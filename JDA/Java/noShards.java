String url = "https://discordbots.group/api/bot/"+jda.getSelfUser().getId();
String token = "";

JSONObject data = new JSONObject();
data.put("count", jda.getGuilds().size());

RequestBody body = RequestBody.create(MediaType.parse("application/json"), data.toString());

Request request = new Request.Builder()
        .url(url)
        .post(body)
        .addHeader("User-Agent", "DiscordBot " + jda.getSelfUser().getName())
        .addHeader("Authorization", token)
        .build();

try {
    new OkHttpClient().newCall(request).execute();
} catch (IOException e) {
    e.printStackTrace();
}
