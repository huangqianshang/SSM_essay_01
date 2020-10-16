var flag = true;
$(function () {
    findNewEmailNum();
    setInterval("findNewEmailNum()",5000);
    $("#newEmailNum").click(function () {
        findNewEmail(flag);
        var aria_expanded = $("#newEmailNum").attr("aria-expanded");
        if (aria_expanded != undefined)
            flag = aria_expanded == "true" ? true : false;
        else
            flag = false;
    });
});