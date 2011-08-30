Ext.Loader.setConfig({
    enabled:true
});

Ext.application({
    name: 'Monterey',
    autoCreateViewport: true,
    controllers: [
        'Contacts'
    ],

    launch: function() {
    }
});
