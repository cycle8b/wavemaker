
package com.sampledatadb.data;



/**
 *  sampledataDB.Inventory
 *  10/02/2012 15:19:54
 * 
 */
public class Inventory {

    private Integer inventoryId;
    private Store store;
    private Film film;

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

}
