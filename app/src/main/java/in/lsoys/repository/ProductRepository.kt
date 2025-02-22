class ProductRepository(private val apiService: ApiService) {
    suspend fun fetchProducts() = apiService.getProducts()
}
