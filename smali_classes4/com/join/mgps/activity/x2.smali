.class public final synthetic Lcom/join/mgps/activity/x2;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/ShareWebActivity$o;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/ShareWebActivity$o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/x2;->b:Lcom/join/mgps/activity/ShareWebActivity$o;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/activity/x2;->b:Lcom/join/mgps/activity/ShareWebActivity$o;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/join/mgps/activity/ShareWebActivity$o;->a(Lcom/join/mgps/activity/ShareWebActivity$o;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
