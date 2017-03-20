<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show_video</title>
</head>
<body>
<div id="div_video"></div>
<script type="text/javascript" src="ckplayer/ckplayer.js" charset="utf-8"></script>
<script type="text/javascript">

    var width = window.screen.availWidth / 2;
    var height = width * 2 / 3;
    var flashvars = {
        f: '${video_url}',
        c: 0,
        b: 1,
        p: '1'
    };
    var params = {bgcolor: '#FFF', allowFullScreen: true, allowScriptAccess: 'always', wmode: 'transparent'};
    CKobject.embedSWF('ckplayer/ckplayer.swf', 'div_video', 'ckplayer_div_video', width, height, flashvars, params);
</script>
</body>
</html>