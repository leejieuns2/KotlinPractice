package doItKotlin.chap03;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*
@Metadata(
        mv = {1, 4, 1},
        bv = {1, 0, 3},
        k = 2,
        d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a*\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0014\b\b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"},
        d2 = {"main", "", "shortFunc_noinline", "a", "", "out", "Lkotlin/Function1;", "kotlinPractice.main"}
)

public final class NoinlineTest_decompile {
    public static final void main() {
        byte a$iv = 3;
        Function1 out$iv = (Function1)null.INSTANCE;
//        int $i$f$shortFunc_noinline = false;
        String var3 = "Before calling out()";
        boolean var4 = false;
        System.out.println(var3);
        // 인라인 되지 않고 호출됨.
        out$iv.invoke(Integer.valueOf(a$iv));
        var3 = "After calling out()";
        var4 = false;
        System.out.println(var3);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }

    public static final void shortFunc_noinline(int a, @NotNull Function1 out) {
        int $i$f$shortFunc_noinline = 0;
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
 */
