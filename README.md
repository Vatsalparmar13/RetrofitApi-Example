# Retrofit RecyclerView Example - Android Studio (Java)

This is a simple Android app demonstrating how to use **Retrofit** to fetch data from an API and display it in a **RecyclerView**. The app is built using **Java** in **Android Studio** and makes a `GET` request to retrieve data from a REST API.

## Features
✅ Fetch data from API using **Retrofit**  
✅ Display data in **RecyclerView**  
✅ Use **ViewHolder & Adapter** for efficient rendering  
✅ Implement **Gson** for JSON parsing  

## Technologies Used
- **Retrofit** for API calls  
- **RecyclerView** for displaying data  
- **Gson** for JSON deserialization  
- **Android Studio** (Java)  

## How It Works
1. **Setup Retrofit** – Define the API interface and create a Retrofit instance.  
2. **Fetch Data** – Make a `GET` request to retrieve data from the API.  
3. **Parse JSON** – Use **Gson** to parse the API response.  
4. **Display in RecyclerView** – Use an Adapter to bind data to the UI.  

## Installation
1. Clone the repository:  
   ```sh
   git clone https://github.com/yourusername/RetrofitRecyclerViewExample.git
   ```
2. Open in **Android Studio**  
3. Add necessary dependencies in `build.gradle`:  
   ```gradle
   implementation 'com.squareup.retrofit2:retrofit:2.11.0'
   implementation 'com.squareup.retrofit2:converter-gson:2.11.0'
   ```
4. Run the project! 🚀  

## License
This project is open-source and available under the [MIT License](LICENSE).
