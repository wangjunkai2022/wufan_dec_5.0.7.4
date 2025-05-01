.class public final Lcom/join/kotlin/base/utils/CommonExtKt$notNull$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CommonExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/base/utils/CommonExtKt;->notNull$default(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommonExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt$notNull$1\n*L\n1#1,142:1\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCommonExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt$notNull$1\n*L\n1#1,142:1\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/join/kotlin/base/utils/CommonExtKt$notNull$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/kotlin/base/utils/CommonExtKt$notNull$1;

    invoke-direct {v0}, Lcom/join/kotlin/base/utils/CommonExtKt$notNull$1;-><init>()V

    sput-object v0, Lcom/join/kotlin/base/utils/CommonExtKt$notNull$1;->INSTANCE:Lcom/join/kotlin/base/utils/CommonExtKt$notNull$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/utils/CommonExtKt$notNull$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 0

    return-void
.end method
