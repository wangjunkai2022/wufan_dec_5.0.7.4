.class public final synthetic Lcom/join/mgps/fragment/c;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/c;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/fragment/c;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a(Lcom/join/mgps/fragment/CommonWebviewFragment$m;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
