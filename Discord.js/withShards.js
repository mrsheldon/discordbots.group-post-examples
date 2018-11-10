client.shard.fetchClientValues('guilds.size')
.then(results => {
  var totalGuilds = results.reduce((prev, val) => prev + val, 0);
const DBG = require('discordbots.group');
const DBGClient = new DBG(`${client.user.id}`, 'TOKEN_HERE');
  
DBGClient.updateCount(totalGuilds).then(() => {
  console.log('Successfully updated server count.')
}).catch((e) => {
  console.error(e)
})
})
