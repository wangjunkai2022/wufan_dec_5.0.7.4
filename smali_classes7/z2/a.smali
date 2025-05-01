.class public final synthetic Lz2/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/a;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lz2/a;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, p1}, Lcom/psk/kotlin/ext/CommonExtKt;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method
