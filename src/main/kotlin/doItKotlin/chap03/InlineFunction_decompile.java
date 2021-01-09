package doItKotlin.chap03;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 4, 1},
        bv = {1, 0, 3},
        k = 2,
        d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a(\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"},
        d2 = {"main", "", "shortFunc", "a", "", "out", "Lkotlin/Function1;", "kotlinPractice.main"}
)
public final class InlineFunction_decompile {
    public static final void main() {
        // 여기서부터 1회 복사
        int a$iv = 3;
//        int $i$f$shortFunc = false;
        String var2 = "Before calling out()";
        boolean var3 = false;
        System.out.println(var2);
//        int var5 = false;
        String var6 = "First Call: " + a$iv;    // out(a)
        boolean var7 = false;
        System.out.println(var6);
        var2 = "After calling out()";
        var3 = false;
        System.out.println(var2);

        // 여기서부터 2회 복사
        a$iv = 5;
//        $i$f$shortFunc = false;
        var2 = "Before calling out()";
        var3 = false;
        System.out.println(var2);
//        var5 = false;
        var6 = "Second Call: " + a$iv; // out(a)
        var7 = false;
        System.out.println(var6);
        var2 = "After calling out()";
        var3 = false;
        System.out.println(var2);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }

    public static final void shortFunc(int a, @NotNull Function1 out) {
        int $i$f$shortFunc = 0;
        Intrinsics.checkNotNullParameter(out, "out");
        String var3 = "Before calling out()";
        boolean var4 = false;
        System.out.println(var3);
        out.invoke(a);
        var3 = "After calling out()";
        var4 = false;
        System.out.println(var3);
    }
}

