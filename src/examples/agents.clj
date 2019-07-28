;https://www.tutorialspoint.com/clojure/clojure_agents.htm
(ns examples.agents)

;1	agent
;(agent state)
;An agent is created by using the agent command.
(defn Example1 []
  (def counter1 (agent 0))
  (println counter1))
(Example1)

(defn Example2 []
  (def counter2 (agent 0))
  (println @counter2))
(Example2)

;2	send
;(send agentname function value)
;This function is used to send across a value to the agent.
(defn Example3 []
  (def counter3 (agent 0))
  (println @counter3)

  (send counter3 + 100)
  (println "Incrementing Counter")
  (println @counter3))
(Example3)

;3	shutdown-agents
;(shutdown-agents)
;This function is used to shut down any running agents.
(defn Example4 []
  (def counter4 (agent 0))
  (println @counter4)

  (send counter4 + 100)
  (println "Incrementing Counter")
  (println @counter4)
  (shutdown-agents))
(Example4)

;4	send-off
;(send agentname function value)
;There are instances wherein an agent is assigned a function which is blocking in nature.
(defn Example5 []
  (def counter5 (agent 0))
  (println @counter5)

  (send-off counter5 + 100)
  (println @counter5)
  (println @counter5))
(Example5)

;5	await-for
;(await-for time agentname)
;Since there is a delay when a value of an agent is updated, Clojure provided a ‘await-for’ function which is used
; to specify time in milliseconds to wait for the agent to be updated.
(defn Example6 []
  (def counter6 (agent 0))
  (println @counter6)

  (send-off counter6 + 100)
  (println (await-for 100 counter6))
  (println @counter6)

  (shutdown-agents))
(Example6)

;6	await
; Blocks the current thread (indefinitely!) until all actions dispatched thus far,
; from this thread or agent, to the agent(s) have occurred. Will block on failed agents.
(defn Example7 []
  (def counter7 (agent 0))
  (println @counter7)

  (send-off counter7 + 100)
  (await counter7)
  (println @counter7)

  (shutdown-agents))
(Example7)

;7	agent-error
;Returns the exception thrown during an asynchronous action of the agent, if the agent fails. Returns nil if the agent does not fail.
(defn Example []
  (def my-date (agent(java.util.Date.)))
  (send my-date + 100)
  (await-for 100 my-date)
  (println (agent-error my-date)))
(Example)