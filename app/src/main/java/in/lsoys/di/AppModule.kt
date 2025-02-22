val appModule = module {
    single { Retrofit.Builder().baseUrl("https://api.example.com/").build().create(ApiService::class.java) }
    single { ProductRepository(get()) }
    viewModel { ProductViewModel(get()) }
}
