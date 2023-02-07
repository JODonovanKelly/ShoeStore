
package com.udacity.shoestore


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : ViewModel() {

    private val _shoes = MutableLiveData<List<Shoe>>()
    val shoes: LiveData<List<Shoe>>
        get() = _shoes

    init {
        initialShoeList()
        //_shoes.value
    }

    private fun initialShoeList() {
        val pair1 = Shoe("Gel Venture 11", 10.5, "ASICS", "Gud Business")
        val pair2 = Shoe("Duramo 10", 10.0, "Adidas", "Gud Bisnes")

        _shoes.postValue(mutableListOf(pair1, pair2))
    }
}
