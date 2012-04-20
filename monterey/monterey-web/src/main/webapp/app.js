Ext.Loader.setConfig({
    enabled:true
});

Ext.application({

    name: 'Monterey',
    appFolder: 'app',
    autoCreateViewport: false,
    enableQuickTips: true,

    controllers: [
        'Contacts'
    ],

    requires: [

    ],

    launch: function() {
        this.viewport = Ext.create('Monterey.view.Viewport', {
            application:this
        });
    }
});
