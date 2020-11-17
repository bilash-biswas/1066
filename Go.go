package main

import (
	"fmt"
)

func main() {
	var a [5]int
	var i, positive, even, odd, negative int
	even = 0
	odd = 0
	positive = 0
	negative = 0
	for i = 0; i < 5; i++ {
		fmt.Scan(&a[i])
	}
	for i = 0; i < 5; i++ {
        if a[i] % 2 == 0 {
          even++
        } else {
          odd++
        }
        if a[i] > 0 {
          positive++
        } else if a[i] < 0 {
          negative++
        }
	}
	fmt.Printf("%d valor(es) par(es)\n", even)
	fmt.Printf("%d valor(es) impar(es)\n", odd)
	fmt.Printf("%d valor(es) positivo(s)\n", positive)
	fmt.Printf("%d valor(es) negativo(s)\n", negative)
}
