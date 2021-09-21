(ns tracks-on-tracks-on-tracks-test
  (:require [clojure.test :refer [deftest is]]
            tracks-on-tracks-on-tracks))

(deftest ^:task1 list-empty-test
  (is (= '() (tracks-on-tracks-on-tracks/new-list))))

(deftest ^:task2 list-add-test
  (is (= '("JavaScript" "Java" "Lisp" "Clojure")
         (-> (tracks-on-tracks-on-tracks/new-list)
             (tracks-on-tracks-on-tracks/add-language "Clojure")
             (tracks-on-tracks-on-tracks/add-language "Lisp")
             (tracks-on-tracks-on-tracks/add-language "Java")
             (tracks-on-tracks-on-tracks/add-language "JavaScript")))))

(deftest ^:task3 first-test
  (is (= "Lisp" (tracks-on-tracks-on-tracks/first-language '("Lisp" "Clojure")))))

(deftest ^:task4 list-remove-test
  (is (= '("Clojure") (tracks-on-tracks-on-tracks/remove-language '("Lisp" "Clojure")))))

(deftest ^:task5 list-count-test
  (is (= 3 (tracks-on-tracks-on-tracks/count-languages '("JavaScript" "Java" "Clojure")))))

(deftest ^:task6 learning-list-test
  (is (= 3 (tracks-on-tracks-on-tracks/learning-list))))
