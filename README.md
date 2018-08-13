# Stock-Market-Prediction-App


Stock Price Prediction Time Series Forecasting  with Spark Scala 

----------------------------------------------------

This module is responsible to predict clode stock price, Predicting Stock Price using ARIMA Time Series Prediction 
 
## Requirement:

- Scala 2.11

- Spark 2.2

- Cloudera Sparkts-0.4.0

- Spark-mllib 2.2.0

- spark-core 2.2.0

export PROJECT_HOME=stockPrediction/stockPrediction

export PROJECT_JAR_PATH=${PROJECT_HOME}/target/scala-2.11

## COMPILE:

cd $PROJECT_HOME

$ sbt compile

$ sbt run


## EXECUTE:

Cluster mode (YARN) : 4 Data Nodes

spark-submit  jar  $PROJECT_JAR_PATH/stock_prediction_2.11-1.0.jar  $INPUT_PATH $OUTPUT_PATH \

--master yarn-client \

--driver-memory 5g \

--number-executor 20 \

--executor-memory 4g \

--executor-cores 5

## Local mode (Standlone)

spark-submit  jar  $PROJECT_JAR_PATH/stock_prediction_2.11-1.0.jar $INPUT_PATH $OUTPUT_PATH  \

--master local[5] \

--driver-memory 5g \

--number-executor 20 \

--executor-memory 4g
