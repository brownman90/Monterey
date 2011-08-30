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
			region: 'north',
			xtype: 'panel',
			split: false
		}, {
			region: 'center',
			xtype: 'panel',
			plain: true
		}, {
			region: 'west',
			xtype: 'panel',
			width: 180
		} ];

		me.callParent(arguments);
	}

});