# coinbase-exchange-java
Java based wrapper for the [Coinbase Exchange API](https://docs.exchange.coinbase.com/#introduction)

#Functions needed:
    - [x]Authentication (GET, POST, DELETE supported)
    - [x]Get Accounts
    - [x]Place a new Order
    - [x]Cancel an Order
    - [x]List Open Orders
    - [x]Get an Order
    - [x]Get Account History
    - [ ]List fills
    - [ ]HTTP Error code support
    - [ ]Pagination support for all calls that support it
    - [ ]List of Currencies
    
#Features wanted:
    - [ ]Transfer Funds
    - [ ]Web Socket support
    - [ ]Market Data support
    - [x]Product Order book support

#Notes:
>Coinbase Exchange primary data sources and servers run in the Amazon US East data center. To minimize latency for API access, we recommend making requests from servers located near the US East data center.