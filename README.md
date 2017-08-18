# timbre-datomic-handler

A simple Datomic handler that logs via Timbre.

## Usage

Read the [Datomic Monitoring - Clojure
callbacks](http://docs.datomic.com/monitoring.html#clojure-callbacks) docs.

This library exposes a single function to handle monitoring events from Datomic
and log them via Timbre:

```clojure
devth.timbre-datomic-handler/handler
```

## License

Copyright © 2017 Trevor C. Hartman

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
