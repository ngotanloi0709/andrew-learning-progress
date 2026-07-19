clean:
	@echo Cleaning .class files...
	@del /s /q *.class 2>nul || true
	@echo Done!

.PHONY: clean
