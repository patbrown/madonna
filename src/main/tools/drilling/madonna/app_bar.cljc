(ns tools.drilling.madonna.app-bar
  (:require [com.fulcrologic.fulcro.algorithms.react-interop :refer [react-factory]]
            #?(:cljs ["@mui/material/AppBar" :default AppBar])))

(def app-bar (react-factory #?(:cljs AppBar :clj nil)))
