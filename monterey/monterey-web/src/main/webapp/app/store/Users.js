Ext.define('USERS.store.Users', {
	
	extend: 'Ext.data.Store',
	model: 'USERS.model.User',
	autoLoad: true,
	
	proxy: {
		type: 'ajax',
		api: {
			read: 'data/users.txt'
		},
		reader: {
			type: 'json',
			root: 'users',
			successProperty: 'success'
		}
	}
});