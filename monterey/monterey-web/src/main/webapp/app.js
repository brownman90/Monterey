Ext.Loader.setConfig({
    enabled:true
});

Ext.application({

    name: 'Monterey',
    appFolder: 'app',
    autoCreateViewport: true,
    enableQuickTips: true,

    controllers: [
        'Contacts'
    ],

    requires: [

    ],

    launch: function() {
        console.log('Yeah Baby!');
        Monterey.app = this;

    }

});
