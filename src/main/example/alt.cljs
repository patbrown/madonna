(ns example.alt
  (:require [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
            [com.fulcrologic.fulcro-native.expo-application-40 :as expo]
            [com.fulcrologic.fulcro.application :as app]
            [com.fulcrologic.fulcro-native.alpha.components :refer [ui-text ui-button ui-view ui-image]]))


(defsc Root [this props]
  {}
  (ui-text {} "HEY"))

(defonce SPA (atom nil))

(defn ^:export start
  {:dev/after-load true}
  []
  (app/mount! @SPA Root :i-got-no-dom-node))

(defn init []
  (reset! SPA (expo/fulcro-app {}))
  (start))
