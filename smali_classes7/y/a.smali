.class public final synthetic Ly/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/a;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly/a;->b:Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;

    invoke-static {v0}, Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;->g(Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;)V

    return-void
.end method
