import discord
import asyncio
import aiohttp
import async_timeout
import json

dbg_token='your_token'

async def fetchPost(urlIn, d, h):
    async with aiohttp.ClientSession() as session:
        with async_timeout.timeout(10):
            async with session.post(urlIn, data=d, headers=h) as response:
                session.close()
                return response.status

await postToDBG():
    headers = {
        'Authorization': dbg_token,
        'Content-Type': 'application/x-www-form-urlencoded'
    }
    data = {"count": len(self.bot.guilds)}
    await fetchPost("https://discordbots.group/api/bot/{}".format(botID), data, headers)
