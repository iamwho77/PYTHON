from MOdel import MLModel  # This works because the package is installed

# URLs for your model and scaler pickle files
model_url = 'https://github.com/AfrozSheikh/ML-/raw/main/ML/Regression/regressor.pkl'
scaler_url = 'https://github.com/AfrozSheikh/ML-/raw/main/ML/Regression/scalar.pkl'

# Initialize the model with the URLs
model = MLModel(model_url, scaler_url)

# Example prediction data
import pandas as pd
from sklearn.datasets import fetch_california_housing

# Load the California Housing dataset
df = fetch_california_housing()
df = pd.DataFrame(df.data, columns=df.feature_names)
df = df.iloc[[4]]  # Take only the first row for prediction

# Transform data with the loaded scaler
df_scaled = model.scaler.transform(df)

# Make a prediction
p = model.predict(df_scaled)

print("Prediction:",p)