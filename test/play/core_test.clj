(ns play.core-test
  (:require [clojure.test :refer :all]
            [play.core :refer :all]))

(def eggs {:food "eggs" :meal "breakfast"})
(def steak {:food "steak" :meal "lunch"})
(def pizza {:food "pizza" :meal "lunch"})

(defn sortify [instructions input] input)


(deftest test-sort-according-to-instructions
  (testing "the sample in the blog"
    (let [instructions [[:meal :asc {"breakfast" 1 "lunch" 2 "dinner" 3}]
                        [:food :desc]]
          input [ pizza steak eggs ]
          expected [eggs steak pizza]
          result (sortify instructions input)]
      (is (= result expected))))
  )

(Deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
