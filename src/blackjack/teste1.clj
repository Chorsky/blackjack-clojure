(ns blackjack.teste1)

(def nome "Cesar")
(def idade 30)
(def numeros [1 3 6 8 ])

(println numeros)

(defn saudacao
  "Saudação iniciante em Clojure"
  [nome]
  (str "Bem-vindo " nome))

(println (saudacao nome))