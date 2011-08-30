Ext.Loader.setConfig({
    enabled:true
});

Ext.application({
    name: 'USERS',
    autoCreateViewport: false,
    controllers: [
        'Users'
    ],

    launch: function() {
    }
});
