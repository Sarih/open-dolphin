import cpm  = require("../../js/dolphin/ClientPresentationModel");
import ca   = require("../../js/dolphin/ClientAttribute");
import cmd  = require("../../js/dolphin/Command");
export module dolphin {

    export class InitializeAttributeCommand extends cmd.dolphin.Command {


        className:string;

        constructor(public pmId:string, public pmType:string, public propertyName:string, public qualifier:string, public newValue:any, public tag:string = "VALUE") {
            super();
            this.id = 'InitializeAttribute';
            this.className = "org.opendolphin.core.comm.InitializeAttributeCommand";
        }
    }
}