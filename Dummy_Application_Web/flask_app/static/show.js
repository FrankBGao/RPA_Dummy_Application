$(function () {
    $('.all>li').click(function () {
        $(this).children().stop().slideToggle()
    });

});

function do_nothing() {
    return false;
}