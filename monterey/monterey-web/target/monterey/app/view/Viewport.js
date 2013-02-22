Ext.define('Monterey.view.Viewport', {
	extend: 'Ext.Viewport',
	id: 'viewport',

	layout: {
		type: 'border',
		padding: 5
	},
	defaults: {
		split: true
	},

	initComponent: function() {
		var me = this;

		me.items = [ {
		    xtype: 'panel',
			region: 'north',
			height: 66,
			border: false,
			bodyCls: 'header_bg',
            contentEl: 'header'
		}, {
		    xtype: 'panel',
			region: 'center',
			border: false,
			plain: true
		}, {
		    xtype: 'panel',
			region: 'west',
			width: 180,
			border: false
		} ];

		me.callParent(arguments);
	}

});