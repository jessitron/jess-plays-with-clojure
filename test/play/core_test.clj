(ns play.core-test
  (:require [clojure.test :refer :all]
            [play.core :refer :all]))

(def eggs {:food "eggs" :meal "breakfast"})
(def steak {:food "steak" :meal "lunch"})
(def pizza {:food "pizza" :meal "lunch"})

(defn sortify [instructions input] input)


#_(deftest test-sort-according-to-instructions
  (testing "the sample in the blog"
    (let [instructions [[:meal :asc {"breakfast" 1 "lunch" 2 "dinner" 3}]
                        [:food :desc]]
          input [ pizza steak eggs ]
          expected [eggs steak pizza]
          result (sortify instructions input)]
      (is (= result expected))))
  )


(defn method-under-test []
  {:category "food"
   :children [ { :category "fruit"
                :updatedAt "yesterday"
                :createdAt "yesterday"}
               ]
   :createdAt "last week"
   :updatedAt "last week"})

(deftest streamline-returned-tree
  (testing "boring fields are not returned"
    (let [result (method-under-test)]
      (is (seq (:children result))))))
