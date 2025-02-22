@HiltViewModel
class ProductViewModel @Inject constructor(private val repository: ProductRepository) : ViewModel() {
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    fun loadProducts() {
        viewModelScope.launch {
            _products.value = repository.fetchProducts()
        }
    }
}
