(function () {
    "use strict";

if(!window.plugins) {
  window.plugins = {};
}
var phonegap = window.PhoneGap || window.Cordova || window.cordova;
 
window.plugins.remFixer = function() {
    phonegap.exec(
        null,
        null,
        'RemFixerPlugin',
        null,
        []
    );
};

})();
