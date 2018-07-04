val url = "https://discordbots.group/api/bot/${jda.selfuser.id}"
val client = OkHTTPClient()
val data : JSONObject = JSONObject()
data.put("count", jda.guilds.size())
val body : RequestBody = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), data.toString());

val request : Request = RequestBuilder()
    .url(url)
    .post(body)
    .addHeader("Authorization", bot_key_here)
    .build()
try {
    client().newCall(request).execute()
} catch (e: Exception) {
    e.printStackTrace();
}