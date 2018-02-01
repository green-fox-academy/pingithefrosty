using System;
using System.Collections.Generic;

namespace MutualElements
{
    class Program
    {
        static void Main(string[] args)
        {
            // Create a method that takes two integer lists as a parameter
            // and returns an integer list with the mutual elements from the lists.
            // Write at least 3 different test cases.

            // For example:
            var firstList = new List<int>(){ 1, 1, 2, 3, 3, 4 };
            var secondList = new List<int>(){ 3, 4, 4, 5, 6 };
            
            var mutualElements = FilterMutualElements(firstList, secondList);

            mutualElements.ForEach(i => Console.Write("{0}, ", i));
            // Should print: 
            // [3,4]

            Console.ReadLine();
        }
    }
}

