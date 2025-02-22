@Composable
fun ProductListScreen(viewModel: ProductViewModel = hiltViewModel()) {
    val products by viewModel.products.observeAsState(emptyList())
    LazyColumn {
        items(products) { product ->
            Text(text = "${product.name} - $${product.price}")
        }
    }
}
