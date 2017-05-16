Demo rendering a [reagent](https://github.com/reagent-project/reagent) component on the command line using nodejs.

	$ npm install
	$ lein cljsbuild once prod
	$ node renderer.js

This will produce the following output:

```html
<html data-reactroot="" data-reactid="1" data-react-checksum="-353600583"><body data-reactid="2"><div data-reactid="3"><h3 data-reactid="4">I am a component!</h3><p class="someclass" data-reactid="5"><!-- react-text: 6 -->I have <!-- /react-text --><strong data-reactid="7">bold</strong><span style="color:red;" data-reactid="8"> and red</span><!-- react-text: 9 --> text.<!-- /react-text --></p></div></body></html>
```

