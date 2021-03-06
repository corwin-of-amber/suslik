package org.tygus.suslik.synthesis

import org.scalatest.{FunSpec, Matchers}
import org.tygus.suslik.synthesis.instances.PhasedSynthesis

class PaperBenchmarks extends FunSpec with Matchers with SynthesisRunnerUtil {

  val synthesis: Synthesis = new PhasedSynthesis

  def doRun(testName: String, desc: String, in: String, out: String, params: SynConfig = defaultConfig): Unit =
    it(desc) {
      synthesizeFromSpec(testName, in, out, params)
    }

  describe("SuSLik should be able synthesize") {
    runAllTestsFromDir("paper-examples")
  }

  describe("Integers") {
    runAllTestsFromDir("paper-benchmarks/ints")
  }

  describe("Singly-linked list with bounds") {
    runAllTestsFromDir("paper-benchmarks/sll-bounds")
  }

  describe("Singly-linked list with set of elements") {
    runAllTestsFromDir("paper-benchmarks/sll")
  }

  describe("Sorted list") {
    runAllTestsFromDir("paper-benchmarks/srtl")
  }

  describe("Trees with size or elements") {
    runAllTestsFromDir("paper-benchmarks/tree")
  }

  describe("Binary search trees") {
    runAllTestsFromDir("paper-benchmarks/bst")
  }

}
