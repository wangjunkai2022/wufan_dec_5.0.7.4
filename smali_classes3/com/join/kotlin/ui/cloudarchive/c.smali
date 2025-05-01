.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/c;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/c;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lcom/join/kotlin/ui/cloudarchive/GameDetailModCloudListFragment;->V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method
