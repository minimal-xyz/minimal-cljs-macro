
Macro example for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

> Simple example to try macros in ClojureScript. Some tricky things.

### Develop

With hot code swapping support:

```bash
yarn
yarn shadow-cljs watch server

# another tty
node target/main.js
```

### Build

```bash
yarn shadow-cljs compile app
```

Compiles to `target/`.

### Steps

* add `shadow-cljs.edn` to config compilation
* run `node target/main.js` to start app and connect reload server

### License

MIT
