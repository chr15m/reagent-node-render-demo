(ns reagent-node-render-demo.core
  (:require [cljs.nodejs :as nodejs]
            [reagent.impl.template :as tmpl]))

(nodejs/enable-util-print!)

(defn some-component []
  [:html
   [:body
    [:div
     [:h3 "I am a component!"]
     [:p.someclass 
      "I have " [:strong "bold"]
      [:span {:style {:color "red"}} " and red"]
      " text."]]]])

(defn -main []
  (print (js/ReactDOMServer.renderToString
           (tmpl/as-element [some-component]))))

(set! *main-cli-fn* -main)
