(ns onyx.protocol.task-state)

(defprotocol PTaskStateMachine
  (killed? [this])
  (start [this])
  (stop [this])
  (new-iteration? [this])
  (advanced? [this])
  (next-replica! [this replica])
  (next-cycle! [this])
  (set-input-pipeline! [this new-input-pipeline])
  (get-input-pipeline [this])
  (set-output-pipeline! [this new-output-pipeline])
  (get-output-pipeline [this])
  (set-replica! [this new-replica])
  (set-sealed! [this new-sealed?])
  (sealed? [this])
  (get-replica [this])
  (get-windows-state [this])
  (set-windows-state! [this new-windows-state])
  (get-lifecycle [this])
  (print-state [this])
  (heartbeat! [this])
  (reset-event! [this])
  (set-event! [this new-event])
  (update-event! [this f])
  (get-event [this])
  (set-messenger! [this new-messenger])
  (get-messenger [this])
  (set-coordinator! [this new-coordinator])
  (get-coordinator [this])
  (set-context! [this new-context])
  (get-context [this])
  (goto-recover! [this])
  (goto-next-batch! [this])
  (goto-next-iteration! [this])
  (exec [this])
  (advance [this]))
