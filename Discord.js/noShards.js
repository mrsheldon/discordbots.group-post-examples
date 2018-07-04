const DBG = require('discordbots.group');
const DBGClient = new DBG(`${client.user.id}`, 'TOKEN_HERE');
DBGClient.updateServerCount(client.guilds.size);