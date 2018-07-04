$GUILDCOUNT = 10;
$BOTID = "1234567890";
$AUTH = "token";

$botData = ["count"=>$GUILDCOUNT];
$botData = json_encode($botData);
$URL = "https://discordbots.group/api/bot/".$BOTID;

$ch = curl_init();
curl_setopt($ch, CURLOPT_URL, $URL);
curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_POST, 1);
curl_setopt($ch, CURLOPT_POSTFIELDS, $botData);
curl_setopt($ch, CURLOPT_HTTPHEADER, array(
    'Authorization: '.$AUTH,
    'Content-Type: application/x-www-form-urlencoded'
));
$result = curl_exec($ch);
curl_close($ch);