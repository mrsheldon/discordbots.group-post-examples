const DBG = require('discordbots.group');
const DBGClient = new DBG(`${client.user.id}`, 'TOKEN_HERE');

DBGCLIENT.updateCount(client.guilds.size).then(() => {
    console.log('Successfully updated server count.')
}).catch((e) => {
    console.error(e)
})
